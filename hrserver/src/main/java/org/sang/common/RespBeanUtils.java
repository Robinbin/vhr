package org.sang.common;

import org.sang.bean.RespBean;

public class RespBeanUtils {
    public static RespBean DELETE_SUCCESS = RespBean.ok("删除成功!");
    public static RespBean DELETE_ERROR = RespBean.error("删除失败!");
    public static RespBean UPDATE_SUCCESS = RespBean.error("更新成功!");
    public static RespBean UPDATE_ERROR = RespBean.error("更新失败!");
    public static RespBean ADD_SUCCESS = RespBean.error("添加成功!");
    public static RespBean ADD_ERROR = RespBean.error("添加失败!");
    public static RespBean IMPORT_SUCCESS = RespBean.error("导入成功!");
    public static RespBean IMPORT_ERROR = RespBean.error("导入失败!");
    public static RespBean MODIFY_SUCCESS = RespBean.error("修改成功!");
    public static RespBean MODIFY_ERROR = RespBean.error("修改失败!");
    public static RespBean SEND_SUCCESS = RespBean.error("发送成功!");
    public static RespBean SEND_ERROR = RespBean.error("发送失败!");

    private RespBeanUtils() {
    }
}
