package com.example.alg.dto;

import java.util.List;

/**
 * @Auther: dingwei
 * @Date: 2021/1/15 17:30
 * @Description:
 */
public class AlgRepDTO<T> {
    private boolean flag;
    private List<T> list;
    private List<T> openlist;
    private List<T> closelist;
    public AlgRepDTO(boolean flag) {
        this.flag = flag;
    }

    public AlgRepDTO() {
    }

    public boolean isFlag() {
        return flag;
    }

    public List<T> getOpenlist() {
        return openlist;
    }

    public void setOpenlist(List<T> openlist) {
        this.openlist = openlist;
    }

    public List<T> getCloselist() {
        return closelist;
    }

    public void setCloselist(List<T> closelist) {
        this.closelist = closelist;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "AlgRepDTO{" +
                "flag=" + flag +
                ", list=" + list +
                '}';
    }
}
