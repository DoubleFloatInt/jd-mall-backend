package cn.doublefloat.jdmall.framework.web.page;


import java.io.Serializable;
import java.util.List;

/**
 * @author 李广帅
 * @date 2020/7/19 4:24 下午
 */
public class TableDataResult implements Serializable {

    /**
     * 总条数
     */
    private Long total;

    /**
     * 数据行
     */
    private List<?> rows;

    /**
     * 状态码
     */
    private Integer code;

    /**
     * 状态信息
     */
    private String msg;

    public TableDataResult() {
    }

    public TableDataResult(Long total, List<?> rows, Integer code, String msg) {
        this.total = total;
        this.rows = rows;
        this.code = code;
        this.msg = msg;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
