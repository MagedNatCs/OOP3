package Controller;

import BusinessLayer.LevelManage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

public class Controller {
    public static  void main(String[]args) throws IOException {
        List<String> a = new LinkedList<>();
        List<String> b = new LinkedList<>();
        List<String> c = new LinkedList<>();
        List<String> d = new LinkedList<>();
        a.add("#################################################");
        a.add("#....s...###..........................#.........#");
        a.add("#........#B#....##..........##........#.........#");
        a.add("#........#......##..........##........#.........#");
        a.add("#........#............................#.........#");
        a.add("#........#............................#.........#");
        a.add("#........#......##..........##........#.........#");
        a.add("#........#......##s........k##........#.........#");
        a.add("#........#s.................##.......k#.........#");
        a.add("#@...........................Q.................q#");
        a.add("#........#s.................##.......k#.........#");
        a.add("#........#......##s........k##........#.........#");
        a.add("#........#......##..........##........#.........#");
        a.add("#........#............................#.........#");
        a.add("#........#............................#.........#");
        a.add("#........#......##..........##........#.........#");
        a.add("#........#B#....##..........##........#.........#");
        a.add("#....s...###..........................#.........#");
        a.add("#################################################");
        /*-------------------------------------------------------*/
        b.add("#########################");
        b.add("#.........M.C...........#");
        b.add("#........qqqqqq.........#");
        b.add("#...###...........###...#");
        b.add("#....Q.............Q....#");
        b.add("#.......................#");
        b.add("#.......................#");
        b.add("#...###...........###...#");
        b.add("#...###...q...q...###...#");
        b.add("#........kk...kk........#");
        b.add("#.......................#");
        b.add("#.......................#");
        b.add("#.......................#");
        b.add("#..k##k...........k##k..#");
        b.add("#...##.............##...#");
        b.add("#..ssss...........ssss..#");
        b.add("#.......................#");
        b.add("#.......................#");
        b.add("#.......................#");
        b.add("#...........@...........#");
        b.add("#########################");
        /*-------------------------------------------------------*/
        c.add("####################################################");
        c.add("#B........................g.......................B#");
        c.add("#..................................................#");
        c.add("#...####....................................####...#");
        c.add("#...####....................................####...#");
        c.add("#...####....................................####...#");
        c.add("#.....................z.......z....................#");
        c.add("#..................................................#");
        c.add("#..................................................#");
        c.add("#..................................................#");
        c.add("#............b............@............b...........#");
        c.add("#..................................................#");
        c.add("#..................................................#");
        c.add("#..................................................#");
        c.add("#.....................z.......z....................#");
        c.add("#..................................................#");
        c.add("#..................................................#");
        c.add("#..................................................#");
        c.add("#..................................................#");
        c.add("#.........................w........................#");
        c.add("####################################################");
        /*-------------------------------------------------------*/
        d.add("#########################");
        d.add("#b..........@..........b#");
        d.add("#.......................#");
        d.add("#...###...........###...#");
        d.add("#.......................#");
        d.add("#...zzz...........zzz...#");
        d.add("#...###g...w.w...g###...#");
        d.add("#.......................#");
        d.add("#......D.........D......#");
        d.add("#..####...........####..#");
        d.add("#..z##z...........z##z..#");
        d.add("#..####...........####..#");
        d.add("#.......................#");
        d.add("########.........########");
        d.add("########.........########");
        d.add("########.ww.K.ww.########");
        d.add("#########################");
        /*-------------------------------------------------------*/
        List<List<String>> levelsContent = new LinkedList<>();
        levelsContent.add(a);
        levelsContent.add(b);
        new LevelManage(levelsContent).Startgame();
    }
}
