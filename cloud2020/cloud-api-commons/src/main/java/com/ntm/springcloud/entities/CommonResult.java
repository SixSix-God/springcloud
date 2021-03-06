package com.ntm.springcloud.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author Blue
 * @Since 2021/3/9 13:51
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T       data;
    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
