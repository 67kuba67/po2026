package lab3;

import java.util.*;

public class CodingBat
{
    public static void main(String[] args) {
        CodingBat cb = new CodingBat();
        System.out.println(cb.sleepIn(true, false));
        System.out.println(cb.loneTeen(14, 67));
        System.out.println(cb.helloName("boron" ));
        System.out.println(cb.firstLast6(new int[]{1,2,3,4,6}));

        Map<String, String> map = new HashMap<>();
        map.put("a", "aaa");
        map.put("c", "cake");
        System.out.println(cb.mapAB3(map));

        System.out.println(cb.wordMultiple(new String[]{"a", "b", "a", "c", "b"}));
    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public boolean loneTeen(int a, int b)
    {
        if (((a>=13 && a<20) && ((b>=20 && b <=99) || (b>=0 && b<13))) || ((b>=13 && b<20) && ((a>=20 && a <=99) || (a>=0 && a<13))))
        {
            return true;
        }

        return false;
    }

    public String helloName(String name)
    {
        return("Hello " + name + "!");
    }

    public boolean firstLast6(int[] nums)
    {
        if((nums[0] == 6) || (nums[nums.length-1] == 6))
        {
            return true;
        }
        return false;
    }

    public Map<String, String> mapAB3(Map<String, String> map)
    {
        boolean hasA = map.containsKey("a");
        boolean hasB = map.containsKey("b");

        if (hasA && !hasB)
        {
            map.put("b", map.get("a"));
        }

        else if (hasB && !hasA)
        {
            map.put("a", map.get("b"));
        }
        return map;
    }

    public Map<String, Boolean> wordMultiple(String[] strings)
    {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : strings)
        {
            if (map.containsKey(s))
            {
                map.put(s, true);
            }

            else
            {
                map.put(s, false);
            }
        }
        return map;
    }
}