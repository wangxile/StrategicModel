import factory.StrategyFactory;
import service.Strategy;

/**
 * @Author:wangqi
 * @Description:
 * @Date:Created in 2019/7/27
 * @Modified by:
 */
public class Main {
    public static void main(String[] args) throws Exception{
        System.out.println(StrategyFactory.INSTANCE.creator(2));
    }
}
