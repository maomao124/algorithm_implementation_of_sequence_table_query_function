/**
 * Project name(项目名称)：算法_顺序表的实现之查询功能
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyArrayListTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/14
 * Time(创建时间)： 15:07
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class MyArrayListTest
{
    public static void main(String[] args)
    {
        MyArrayList list = new MyArrayList();
        list.Add(0, 3);
        list.Add(5);
        list.Add(7);
        list.Add(-1);
        list.Add(2, 4);
        list.Add(-6);
        list.remove(0);
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }
}
