package com.facebank.usersupport.model;

import java.io.Serializable;

/**
 * @author HuBiao
 * @date 2018/3/12 0012 18:21
 **/
public class PageBeanModel implements Serializable {

    private Integer page;

    private Integer pageSize;

    private Long totalCount;

    private Integer totalPage;

    private Object data;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
