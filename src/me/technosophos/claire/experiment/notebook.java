package me.technosophos.claire.experiment;

public class notebook {
    boolean HasDesign;
    int amount_of_pages;
    double size;
    int lines_per_page;
    String colors;

    @Override
    public String toString() {
        return "notebook{" +
                "HasDesign=" + HasDesign +
                ", amount_of_pages=" + amount_of_pages +
                ", size=" + size +
                ", lines_per_page=" + lines_per_page +
                ", colors='" + colors + '\'' +
                '}';
    }
}
