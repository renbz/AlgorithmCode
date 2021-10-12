package java8;

import java.util.Objects;

/**
 * @author Ren
 */

public class Category {
    
    // 主键
    private Long id;
    // 分类标题
    private String title;
    // 子标题
    private String subtitle;
    // 父id
    private Long pid;
    // 排序
    private Integer sort;
    // 价格
    private Float price;

    public Category() {
    }

    public Category(Long id, String title, String subtitle, Long pid, Integer sort, Float price) {
        this.id = id;
        this.title = title;
        this.subtitle = subtitle;
        this.pid = pid;
        this.sort = sort;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", subtitle='" + subtitle + '\'' +
                ", pid=" + pid +
                ", sort=" + sort +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(id, category.id) && Objects.equals(title, category.title) && Objects.equals(subtitle, category.subtitle) && Objects.equals(pid, category.pid) && Objects.equals(sort, category.sort) && Objects.equals(price, category.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, subtitle, pid, sort, price);
    }
}
