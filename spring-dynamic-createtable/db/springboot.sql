-- ----------------------------
-- Table structure for user_log_config
-- ----------------------------
DROP TABLE IF EXISTS `user_log_config`;
CREATE TABLE `user_log_config` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '���',
  `name` varchar(50) NOT NULL COMMENT '�û���',
  `table_name` varchar(150) DEFAULT NULL COMMENT '�û���Ӧ����־�洢��',
  PRIMARY KEY (`id`),
  UNIQUE KEY `name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8 COMMENT='�û���־������';
-- ----------------------------
-- Table structure for user_log
-- ----------------------------
DROP TABLE IF EXISTS `user_log`;
CREATE TABLE `user_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '���',
  `user_name` varchar(50) DEFAULT NULL COMMENT '�û���',
  `operation` varchar(50) DEFAULT NULL COMMENT '�û�����',
  `method` varchar(200) DEFAULT NULL COMMENT '���󷽷�',
  `params` varchar(5000) DEFAULT NULL COMMENT '�������',
  `time` bigint(20) NOT NULL COMMENT 'ִ��ʱ��(����)',
  `ip` varchar(64) DEFAULT NULL COMMENT 'IP��ַ',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2897 DEFAULT CHARSET=utf8 COMMENT='�û�������־';