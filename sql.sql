-- 角色表
CREATE TABLE roles
(
    r_id    int AUTO_INCREMENT PRIMARY KEY COMMENT '角色主键id' ,
    r_name  varchar(64) NOT NULL UNIQUE COMMENT '角色名称' ,
    `declare` varchar(255) NOT NULL COMMENT '角色说明' ,
    is_del  int(1) DEFAULT 0 COMMENT '0表示位删除，1表示删除'
)  COMMENT '角色表';

-- 权限表
CREATE TABLE permissions
(
    p_id    int AUTO_INCREMENT PRIMARY KEY COMMENT '权限主键id' ,
    p_name  varchar(128) NOT NULL UNIQUE COMMENT '权限名称' ,
    `declare` varchar(255) NOT NULL COMMENT '权限说明' ,
    is_del  int DEFAULT 0 COMMENT '0表示位删除，1表示删除'
) COMMENT '权限表';

-- 角色-权限中间表
CREATE TABLE roles_permissions_relation
(
    id      int AUTO_INCREMENT PRIMARY KEY COMMENT '主键id' ,
    `r_id`  int COMMENT '角色id' ,
    `p_id`  int COMMENT '权限id' ,
    CONSTRAINT privilege_role FOREIGN KEY(r_id) REFERENCES roles(r_id) ,
    CONSTRAINT role_privilege FOREIGN KEY(p_id) REFERENCES privilege(p_id)
);


CREATE TABLE order_item
(
    u_id  int AUTO_INCREMENT PRIMARY KEY COMMENT 'id主键' ,
    o_id int NOT NULL UNIQUE COMMENT '订单id',
    o_no varchar(32) UNIQUE NOT NULL COMMENT '订单号',
    oi_name  varchar(128) NOT NULL COMMENT '商品名',
    oi_img  varchar(255) NOT NULL COMMENT '商品图片',
    oi_size int DEFAULT 1 COMMENT '数量',
    is_del  int(1)  DEFAULT 0 COMMENT '1表示删除，0表示未删除'
);
