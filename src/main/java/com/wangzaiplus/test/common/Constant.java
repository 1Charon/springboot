package com.wangzaiplus.test.common;

import java.util.Arrays;

public class Constant {

    public static final int MAX_SIZE_PER_TIME = 1000;
    public static final int INDEX_ZERO = 0;
    public static final int NUMBER_ZERO = 0;
    public static final int NUMBER_ONE = 1;

    public interface Redis {
        String OK = "OK";
        // 过期时间, 60s, 一分钟
        Integer EXPIRE_TIME_MINUTE = 60;
        // 过期时间, 一小时
        Integer EXPIRE_TIME_HOUR = 60 * 60;
        // 过期时间, 一天
        Integer EXPIRE_TIME_DAY = 60 * 60 * 24;
        String TOKEN_PREFIX = "token:";
        String MSG_CONSUMER_PREFIX = "consumer:";
        String ACCESS_LIMIT_PREFIX = "accessLimit:";
    }

    public interface LogType {
        // 登录
        Integer LOGIN = 1;
        // 登出
        Integer LOGOUT = 2;
    }

    public interface MsgLogStatus {
        // 消息投递中
        Integer DELIVERING = 0;
        // 投递成功
        Integer DELIVER_SUCCESS = 1;
        // 投递失败
        Integer DELIVER_FAIL = 2;
        // 已消费
        Integer CONSUMED_SUCCESS = 3;
    }

    public enum CalculateTypeEnum {
        ADD(1, "加"),
        SUBTRACT(2, "减"),
        MULTIPLY(3, "乘"),
        DIVIDE(4, "除")
        ;

        Integer type;
        String desc;

        CalculateTypeEnum(Integer type, String desc) {
            this.type = type;
            this.desc = desc;
        }

        public Integer getType() {
            return type;
        }

        public String getDesc() {
            return desc;
        }
    }

    public enum FundType {
        STOCK_FUND(1, "股票型"),
        HYBRID_FUND(2, "混合型"),
        BOND_FUND(3, "债券型"),
        INDEX_FUND(4, "指数型"),
        QDII(5, "QDII")
        ;

        private int code;
        private String msg;

        FundType(int code, String msg) {
            this.code = code;
            this.msg = msg;;
        }

        public int getCode() {
            return code;
        }

        public String getMsg() {
            return msg;
        }

        public static boolean contains(int code) {
            FundType[] values = FundType.values();
            return Arrays.stream(values).filter(fundType -> fundType.getCode() == code).findAny().isPresent();
        }

    }

}
