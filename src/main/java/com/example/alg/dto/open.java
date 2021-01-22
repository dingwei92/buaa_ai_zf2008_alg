package com.example.alg.dto;

/**
 * @Auther: dingwei
 * @Date: 2021/1/21 11:29
 * @Description:
 */
public class open {
    private int[] num = new int[9];
    private int evaluation;                //估计函数f(n)：从起始状态到目标的最小估计值
    private int depth;                    //d(n)：当前的深度，即走到当前状态的步骤
    private int misposition;

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public int getMisposition() {
        return misposition;
    }

    public void setMisposition(int misposition) {
        this.misposition = misposition;
    }
}
