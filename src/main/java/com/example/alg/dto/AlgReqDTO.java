package com.example.alg.dto;

import java.util.List;

/**
 * @Auther: dingwei
 * @Date: 2021/1/15 16:53
 * @Description:
 */
public class AlgReqDTO {
    /**
     * 算法
     */
    private String alg;
    /**
     * 起始list
     */
    private List<Integer> list1;
    /**
     * 终止list
     */
    private List<Integer> list3;
    private int mispositiontype;

    public int getMispositiontype() {
        return mispositiontype;
    }

    public void setMispositiontype(int mispositiontype) {
        this.mispositiontype = mispositiontype;
    }

    public String getAlg() {
        return alg;
    }

    public void setAlg(String alg) {
        this.alg = alg;
    }

    public List<Integer> getList1() {
        return list1;
    }

    public void setList1(List<Integer> list1) {
        this.list1 = list1;
    }

    public List<Integer> getList3() {
        return list3;
    }

    public void setList3(List<Integer> list3) {
        this.list3 = list3;
    }

    @Override
    public String toString() {
        return "AlgReqDTO{" +
                "alg='" + alg + '\'' +
                ", list1=" + list1 +
                ", list3=" + list3 +
                '}';
    }
}
