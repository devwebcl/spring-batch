package cl.devweb.model.devwebish;

import java.util.Date;

public class NumMigratedImages {

    private Long id;
    private String original_path;
    private String image_key;
    private Integer width;
    private Integer height;
    private Date created_at;
    private Date updated_at;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOriginal_path() {
        return original_path;
    }

    public void setOriginal_path(String original_path) {
        this.original_path = original_path;
    }

    public String getImage_key() {
        return image_key;
    }

    public void setImage_key(String image_key) {
        this.image_key = image_key;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

}
