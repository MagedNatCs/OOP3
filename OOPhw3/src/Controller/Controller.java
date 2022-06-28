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
//        if (args == null || args.length == 0) {
//            System.out.println("how about inserting some levels??");
//            return;
//        }
//        File levelsfile = new File(args[0]);
//        File[] alllvls = levelsfile.listFiles();
        List<List<String>> levelsContent = new LinkedList<>();
        levelsContent.add(a);
//        for (File lvl : alllvls) {
//            String levelPath = lvl.getAbsolutePath();
//            List<String> lvlContent = Files.readAllLines(Paths.get(levelPath));
//            levelsContent.add(lvlContent);
//        }
        new LevelManage(levelsContent).Startgame();
    }
}
