package collection_framework.list.vector;

import java.util.*;

public class VectorTest {
    public static void main(String[] args) {
        List<Board> list = new Vector<>();

        list.add(new Board("제목0", "내용0", "글쓴이0"));
        list.add(new Board("제목1", "내용1", "글쓴이1"));
        list.add(new Board("제목2", "내용2", "글쓴이2"));
        list.add(new Board("제목3", "내용3", "글쓴이3"));
        list.add(new Board("제목4", "내용4", "글쓴이4"));
        list.add(new Board("제목5", "내용5", "글쓴이5"));

        list.remove(2);
        list.remove(3);

        for(Board b : list) {
            System.out.println(b.subject + "\t" + b.content + "\t" + b.writer);
        }
    }
}
