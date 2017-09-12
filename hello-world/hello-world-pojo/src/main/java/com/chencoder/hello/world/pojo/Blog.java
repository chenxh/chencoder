package com.chencoder.hello.world.pojo;

import com.chencoder.common.base.base.Record;

public class Blog implements Record {
    /**
     * AUTO_INCREMENT
     *
     * @mbg.generated
     */
    private Long id;

    private String title;

    private String col2;

    private String col3;

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

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }

    public String getCol3() {
        return col3;
    }

    public void setCol3(String col3) {
        this.col3 = col3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", title=").append(title);
        sb.append(", col2=").append(col2);
        sb.append(", col3=").append(col3);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Blog other = (Blog) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTitle() == null ? other.getTitle() == null : this.getTitle().equals(other.getTitle()))
            && (this.getCol2() == null ? other.getCol2() == null : this.getCol2().equals(other.getCol2()))
            && (this.getCol3() == null ? other.getCol3() == null : this.getCol3().equals(other.getCol3()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTitle() == null) ? 0 : getTitle().hashCode());
        result = prime * result + ((getCol2() == null) ? 0 : getCol2().hashCode());
        result = prime * result + ((getCol3() == null) ? 0 : getCol3().hashCode());
        return result;
    }
}