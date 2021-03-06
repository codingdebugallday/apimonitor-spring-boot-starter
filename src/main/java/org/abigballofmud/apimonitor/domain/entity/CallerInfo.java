package org.abigballofmud.apimonitor.domain.entity;

import io.swagger.annotations.ApiModel;
import lombok.*;

/**
 * <p>
 * description
 * </p>
 *
 * @author isacc 2019/08/20 16:29
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ApiModel("API调用者信息")
public class CallerInfo {

    /**
     * 服务ID
     */
    private Long serviceId;

    private String serviceName;

    /**
     * 租户ID
     */
    private Long tenantId;

    private String tenantName;

    /**
     * 角色ID
     */
    private Long roleId;

    private String roleName;

    /**
     * 用户ID
     */
    private Long userId;

    private String userName;

    /**
     * 客户端ID
     */
    private Long clientId;

    private String clientName;

}
