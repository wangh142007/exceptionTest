package com.hao.demo.core.util;


import com.hao.demo.core.constant.enums.CommonResponseEnum;
import com.hao.demo.core.response.QR;
import com.hao.demo.core.response.QueryData;
import com.hao.demo.core.response.R;

import java.util.function.Supplier;

/**
 * <pre>
 *  远程调用工具类
 * </pre>
 *
 * @author ：Wang Hao
 * @date ：Created in 2020/6/16 11:30
 */
public class ClientUtil {

    /**
     * 使用例子：
     * organizationClient.getOrganization(licence.getOrganizationId())为Feign调用方法，避免要去判断
     * OrganizationDTO org = ClientUtil.execute(() -> organizationClient.getOrganization(licence.getOrganizationId()));
     */



    /**
     * 封装远程调用, 只返回关心的内容
     *
     * @param supplier 远程调用真正逻辑, 返回内容为: {@link R<T>}
     * @param <T>      关心的内容类型
     * @return 关心的内容
     */
    public static <T> T execute(Supplier<R<T>> supplier) {
        R<T> r = supplier.get();
        CommonResponseEnum.assertSuccess(r);
        return r.getData();
    }

    /**
     * 封装远程调用, 只返回关心的内容
     *
     * @param supplier 程调用真正逻辑, 返回内容为: {@link QR<T>}
     * @param <T>      关心的内容类型
     * @return 关心的内容
     */
    public static <T> QueryData<T> executePage(Supplier<QR<T>> supplier) {
        QR<T> qr = supplier.get();
        CommonResponseEnum.assertSuccess(qr);
        return qr.getData();
    }


}
