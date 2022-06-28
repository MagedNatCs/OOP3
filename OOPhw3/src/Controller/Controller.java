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
         List<String> b = new LinkedList<>();
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
//        if (args == null || args.length == 0) {
//            System.out.println("how about inserting some levels??");
//            return;
//        }
//        File levelsfile = new File(args[0]);
//        File[] alllvls = levelsfile.listFiles();
        List<List<String>> levelsContent = new LinkedList<>();
        levelsContent.add(a);
        levelsContent.add(b);
//        for (File lvl : alllvls) {
//            String levelPath = lvl.getAbsolutePath();
//            List<String> lvlContent = Files.readAllLines(Paths.get(levelPath));
//            levelsContent.add(lvlContent);
//        }
        new LevelManage(levelsContent).Startgame();
    }
}
