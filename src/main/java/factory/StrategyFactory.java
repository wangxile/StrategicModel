package factory;

import annotation.PayAnnotation;
import org.reflections.Reflections;
import service.Strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/27
 * @Modified by:
 */
public class StrategyFactory {
    public final static  StrategyFactory INSTANCE = new  StrategyFactory();

    public static Map<Integer, String> SOURCE_MAP = new HashMap<>();

    static {
        //反射工具包指明扫描路径
        Reflections reflections = new Reflections("service.impl");
        Set<Class<?>> classList = reflections.getTypesAnnotatedWith(PayAnnotation.class);
        //根据注解的值,把实现类类名放到map中
        for (Class<?> clazz : classList) {
            PayAnnotation payAnnotation = clazz.getAnnotation(PayAnnotation.class);
            System.out.println(clazz.getSimpleName());
            System.out.println(clazz.getName());
            SOURCE_MAP.put(payAnnotation.value(),clazz.getName());
        }
    }
    private StrategyFactory(){

    }

    public Strategy creator(Integer type) throws Exception{
        String className = SOURCE_MAP.get(type);
        Class clazz = Class.forName(className);
        return (Strategy) clazz.newInstance();
    }


}
