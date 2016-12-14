package Lesson02;

import Lesson02.ru.javaVebinar.webapp.model.Link;

public class Main {
    public static void main(String[] args) {
        Link link = new Link("JavaVebinar", "javaVebinar.ru");
        Link link1 = link;
        Link link2 = new Link(link);
        System.out.println(link1.equals(link));
        System.out.println(link2.equals(link));
        System.out.println(link.getClass());
    }
}
