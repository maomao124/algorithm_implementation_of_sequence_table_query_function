/**
 * Project name(项目名称)：算法_顺序表的实现之查询功能
 * Package(包名): PACKAGE_NAME
 * Class(类名): MyArrayList
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2021/11/14
 * Time(创建时间)： 15:06
 * Version(版本): 1.0
 * Description(描述)：
 * 上一关的基础上，实现获取指定位置元素的功能。
 * 如list.get(2)返回表中下标为2的元素，即表中第3个元素。
 */


public class MyArrayList
{
    private int[] elements;//元素
    private int size;//List中当前的元素个数

    public MyArrayList()
    {
        this(1);//List默认大小为1
    }

    /**
     * 按指定大小capacity构造List
     *
     * @param capacity List初始化时的大小
     */
    public MyArrayList(int capacity)
    {
        elements = new int[capacity];
        size = 0;
    }

    /**
     * 返回List中元素的个数
     *
     * @return
     */
    public int size()
    {
        return size;
    }

    /**
     * 添加一个元素到末尾
     *
     * @param item
     */
    public void Add(int item)
    {
        int len = elements.length;
        if (size == len - 1)
        {
            resize(2 * len);
        }
        elements[size++] = item;
    }

    /**
     * 添加一个元素到指定位置index
     *
     * @param index
     * @param item
     */
    public void Add(int index, int item)
    {
        validateRangeForAdd(index);
        int len = elements.length;
        if (size == len - 1)
        {
            resize(2 * len);
        }
        for (int i = size; i > index; i--)
        {
            elements[i] = elements[i - 1];
        }
        elements[index] = item;
        size++;
    }

    /**
     * 删除指定位置index的元素,并返回被删除的元素
     *
     * @param index
     * @return 被删除的元素
     */
    public int remove(int index)
    {
        validateRange(index);
        int oldVal = elements[index];
        for (int i = index; i < size - 1; i++)
        {
            elements[i] = elements[i + 1];
        }
        --size;
        return oldVal;
    }

    public int remove()
    {
        if (size == 0)
        {
            System.out.println("删除失败！！！元素为空");
            return -1;
        }
        else
        {
            int result = elements[size - 1];
            size--;
            return result;
        }
    }

    /**
     * 返回表中下标为index的元素
     *
     * @param index 下标
     * @return
     */
    public int get(int index)
    {

        validateRange(index);
        /********** Begin *********/
        return elements[index];  //。。。。。

        /********** End *********/
    }

    /**
     * 校验索引范围
     *
     * @param index
     */
    private void validateRange(int index)
    {
        if (index >= size || index < 0)
        {
            throw new ArrayIndexOutOfBoundsException("索引越界了哦！Index: " + index + ", Size: " + size);
        }
    }

    /**
     * 校验索引范围
     *
     * @param index
     */
    private void validateRangeForAdd(int index)
    {
        if (index > size || index < 0)
        {
            throw new IndexOutOfBoundsException("索引越界了哦！Index: " + index + ", Size: " + size);
        }
    }

    /**
     * 动态扩展数组大小
     *
     * @param capacity
     */
    private void resize(int capacity)
    {
        assert capacity > size;
        int[] tmp = new int[capacity];
        for (int i = 0; i < size; i++)
        {
            tmp[i] = elements[i];
        }
        elements = tmp;
    }

    public void display()
    {
        for (int i = 0; i < size; i++)
        {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }
}
