package org.sang.bean;

import java.sql.Timestamp;

/**
 * Created by sang on 2018/1/10.
 */
public class Oplog {
    private Long id;
    private Long hrid;
    private String operate;
    private Timestamp addDate;

    public Oplog() {
    }

    public Oplog(Builder builder) {
        this.id = builder.id;
        this.hrid = builder.hrid;
        this.operate = builder.operate;
        this.addDate = builder.addDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Oplog position = (Oplog) o;

        return id != null ? id == ((Oplog) o).id : position.id == null;
    }

    @Override
    public int hashCode() {
        return hrid != null ? hrid.hashCode() : 0;
    }

    public Oplog(Long hrid) {
        this.hrid = hrid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHrid() {
        return hrid;
    }

    public void setHrid(Long hrid) {
        this.hrid = hrid;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    public static class Builder {
        private Long id;
        private Long hrid;
        private String operate;
        private Timestamp addDate;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder hrid(Long hrid) {
            this.hrid = hrid;
            return this;
        }

        public Builder operate(String operate) {
            this.operate = operate;
            return this;
        }

        public Builder addDate(Timestamp addDate) {
            this.addDate = addDate;
            return this;
        }

        public Oplog build() {
            return new Oplog(this);
        }
    }
}
