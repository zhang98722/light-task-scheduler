package com.lts.web.repository;

/**
 * @author Robert HG (254963746@qq.com) on 8/22/15.
 */
public class TaskTrackerMonitorDataPo extends AbstractMonitorDataPo {

    /**
     * TaskTracker NodeGroup
     */
    private String taskTrackerNodeGroup;
    /**
     * TaskTracker 节点标识
     */
    private String taskTrackerIdentity;
    /**
     * 执行成功个数
     */
    private Long exeSuccessNum;
    /**
     * 执行失败个数
     */
    private Long exeFailedNum;
    /**
     * 延迟执行个数
     */
    private Long exeLaterNum;
    /**
     * 执行异常个数
     */
    private Long exeExceptionNum;
    /**
     * 总的运行时间
     */
    private Long totalRunningTime;
    // FailStore 占用空间
    private Long failStoreSize;

    public String getTaskTrackerNodeGroup() {
        return taskTrackerNodeGroup;
    }

    public void setTaskTrackerNodeGroup(String taskTrackerNodeGroup) {
        this.taskTrackerNodeGroup = taskTrackerNodeGroup;
    }

    public String getTaskTrackerIdentity() {
        return taskTrackerIdentity;
    }

    public void setTaskTrackerIdentity(String taskTrackerIdentity) {
        this.taskTrackerIdentity = taskTrackerIdentity;
    }

    public Long getExeSuccessNum() {
        return exeSuccessNum;
    }

    public void setExeSuccessNum(Long exeSuccessNum) {
        this.exeSuccessNum = exeSuccessNum;
    }

    public Long getExeFailedNum() {
        return exeFailedNum;
    }

    public void setExeFailedNum(Long exeFailedNum) {
        this.exeFailedNum = exeFailedNum;
    }

    public Long getExeLaterNum() {
        return exeLaterNum;
    }

    public void setExeLaterNum(Long exeLaterNum) {
        this.exeLaterNum = exeLaterNum;
    }

    public Long getExeExceptionNum() {
        return exeExceptionNum;
    }

    public void setExeExceptionNum(Long exeExceptionNum) {
        this.exeExceptionNum = exeExceptionNum;
    }

    public Long getTotalRunningTime() {
        return totalRunningTime;
    }

    public void setTotalRunningTime(Long totalRunningTime) {
        this.totalRunningTime = totalRunningTime;
    }

    public Long getFailStoreSize() {
        return failStoreSize;
    }

    public void setFailStoreSize(Long failStoreSize) {
        this.failStoreSize = failStoreSize;
    }
}
