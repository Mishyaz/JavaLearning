package ru.javaVebinar.webapp.model;

public class Link {
    public static Link ENPTY = new Link();

    private final String name;
    private final String url;

    private Link() {
        this("", null);
    }

    public Link(Link link) {
        this(link.name, link.url);
    }

    public Link(String name, String url) {
        this.name = name;
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Link link = (Link) o;

        return name.equals(link.name) && (url != null ? url.equals(link.url) : link.url == null);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (url != null ? url.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Link{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
