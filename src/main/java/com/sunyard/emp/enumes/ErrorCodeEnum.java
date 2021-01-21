package com.sunyard.emp.enumes;

/**
 *
 */
public enum ErrorCodeEnum {
    /**
     * 中台返回码
     */
    PARAM_FORMAT_ERROR("10002", "参数格式不匹配"),
    PARAM_MISS("20001", "缺少必要参数"),
    PARAM_ERROR("20002", "参数错误"),
    SIGN_ERROR("20003", "签名错误"),
    ARRAY_ERROR("30006", "数组越界"),
    PAYING("30007", "支付处理中"),
    //--------------------------------------------//

    SUCCESS("000000", "处理成功"),

    CUSTOMER_SUCCESS("10000", "处理成功"),

    FAIL("99999", "系统繁忙，请稍后再试"),

    REMOTE_ERROR("99998", "远程调用异常"),

    TIME_ERROR("900009", "时间校验失败"),

    NOT_SUFFICIENT_FUNDS("3008", "余额不足"),

    //产品错误
    PRODUCT_NOTEXIST("200001", "查无此产品"),
    PRODUCT_NO_ERROR("200002", "产品编号错误"),


    APPLY_ERROR("300000", "提交失败"),
    REALNAMEAUTH_ERROR("300001", "实名验证失败"),
    ORDER_NOT_EXIST("300002", "订单不存在"),
    ORDER_NOT_BELONG("300003", "订单不归属该用户"),
    CREDIT_AMOUNT_BEYOND("300004", "超出授信金额"),
    CREDIT_AMOUNT_BELOW("300005", "少于最少金额"),
    PEROID_NOT_EXIST("300006", "期数不在范围内"),
    APPLY_REPE_ERROR("300007", "贷款申请已交易成功或商户申请编号重复"),
    REPAY_WAY_ERROR("300008", "还款方式编号错误"),
    PERIOD_ERROR("300009", "期数错误"),
    APPLY_ID_ERROR("300010", "贷款编号错误"),
    COMERCHANT_NO_ERROR("300011", "商户申请编号错误"),
    CUSTOM_NAME_ERROR("300012", "姓名/名称错误"),
    CHECK_ACC_FAIL("300013", "二类账户校验时第三方接口调用失败"),
    ACCOUNT_NO_ERROR("300014", "二类账户校验不通过，原因："),
    APPLY_NOT_PASS("300015", "贷款申请未通过"),
    VOUCHER_NO_ERROR("300016", "存证编号错误"),
    RECEIPT_NO_REPE("300017", "贷款发放已交易成功或商户借据编号重复"),
    COM_RECEIPT_NO_ERROR("300018", "商户借据编号错误"),
    GRANT_DETAIL_ERROR("300019", "发放明细有误，总额不等于本金加利息"),
    LOEN_MOENY_ERROR("300020", "放款金额与贷款申请金额不相等"),
    CHECK_ACC_ERROR("300021", "二类账户校验时第三方接口返回失败"),
    CORPUS_ADD_ERROR("300022", "放款金额与应还本金不相等"),
    GRANT_ERROR("300023", "账户系统委托贷款归还接口调用失败"),
    NEXT_APPLY_ERROR("300024", "有贷款申请审批拒绝记录，60天内不得再次申请"),
    RENT_SERIAL_NO_REPE("300025", "代扣租金流水号重复"),
    SECOND_ACC_NO_ERROR("300026", "电子账号错误"),
    RENT_SERIAL_NO_ERROR("300027", "代扣租金流水号错误"),
    ORG_SERIAL_NO_ERROR("300028", "原交易流水号错误"),
    APPLY_AUDITING_ERROR("300029", "贷款申请正在审批中，请勿重复提交"),
    FLOW_ERROR("300030", "贷款流程正在进行中，请勿重复申请"),
    NO_ACCOUNT_MSG("300031", "电子账号信息不存在"),
    GRANT_SUCCESS_ERROR("300032", "已放款成功，请勿重复提交"),
    CONTRACT_NOT_VOUCHER_ERR0R("300033", "合同未存证，无此接口调用权限"),
    KKZQ_ERROR("300034", "还款周期错误"),
    GRANT_MONEY_ERROR("300035", "放款金额不能大于申请金额"),
    APPLY_REFUSE_ERROR("300036", "有放款失败记录，拒绝再次贷款申请"),
    RENT_DATA_EXITE("300037", "有代扣租金成功记录，租赁交易未结束，拒绝再次贷款申请"),
    LOAN_MONEY_ERROR("300038", "贷款申请金额不能超过%s元"),
    NOT_RENT_ERROR("300039", "租金代扣成功记录不存在，无此接口调用权限"),
    RENT_ERROR("300040", "每月代扣租金不能低于每期本息和"),
    OPEN_ACC_ERROR("300041", "开户信息不存在"),
    NO_PROD_MERCHANT("300042", "未查询到产品合作单位信息，请联系管理员"),
    NO_MARGIN_MANAGE("300043", "未查询到合作方保证金信息，请联系管理员"),
    CURRENT_MARGIN_ERROR("300044", "当前保证金余额不足"),
    QUERY_CURRENT_MARGIN_ERROR("300052", "查询保证金异常"),
    FILE_NOT_SEND("300045", "存证文件未上送"),
    SECOND_ACC_NOT_MATCH("300046", "老客户申请，电子账号不一致"),
    CUSTOME_NAME_NOT_MATCH("300047", "老客户申请，客户姓名不一致"),
    THREE_ELEMENTS_RUFUSE("300048", "三要素验证拒绝，请修改信息后在重新申请"),
    FILE_DATA_KEY_ERROR("300049", "%s关键字不存在，请检查key是否正确"),
    NO_BANK_CARD("300050", "老客户申请，银行卡号不能为空"),
    NO_ACCOUNT_NO("300051", "老客户申请，电子账号不能为空"),
    HAVE_OVERDUE("300052", "该客户存在逾期借据"),

    BATCH_NO_REPE("500000", "贷款归还已交易成功或批次流水号重复"),
    SERIAL_NO_REPE("500001", "归还流水号重复"),
    RECEIPT_ID_ERROR("500002", "借据编号错误"),
    REPAY_BEING_ERROR("500003", "贷款归还正在处理中，请勿重复请求"),
    LOAN_PAIDOFF_ERROR("500004", "贷款已结清，请勿重复请求"),
    REPAY_DETIAL_ERROR("500005", "归还明细有误，总额不等于本金加利息"),
    BATCH_NO_ERROR("500006", "批次流水号错误"),
    REPAY_DOING_ERROR("500007", "该批次还款正在处理中，请稍后再查询"),
    CORPUS_ERROR("500008", "全额提前还款，归还本金不等于剩余应还本金，借据编号为："),
    SERIAL_NO_ERROR("500009", "归还/明细流水号错误"),
    REPAY_SERIAL_NO_REP("500010", "提前还款已交易成功或提前还款流水号重复"),
    APPLY_REFUSE("500011", "有贷款未结清，拒绝本次贷款申请"),
    ADVANCE_SUCCESS_ERROR("500012", "提前还款已成功,请勿重复提交"),
    GRANT_NOT_SUCCESS_ERROR("500013", "贷款发放未成功，无此接口调用权限"),
    ADVANCE_SERIAL_ERROR("500014", "提前还款流水号错误"),
    TRADE_CORPUS_ERROR("500015", "归还本金不能大于剩余应还本金"),
    TRADE_END("500016", "本次租赁交易结束"),
    DETAIL_SERIALNO_ERROR("500017", "明细流水号错误"),
    ADVANCE_NOT_SUCCESS_ERROR("500018", "未查询到提前还款结果信息"),

    ESIGN_ID_TYPE_ERROR("600001", "证件类型错误"),
    ESIGN_ACCOUNT_TYPE_ERROR("600002", "账号类型错误"),
    ESIGN_SEAL_NO_ERROR("600003", "印章编号错误"),
    ESIGN_SEAL_COLOR_ERROR("600004", "印章颜色错误"),
    ESIGN_NO_POS_PAGE("600005", "定位类型为坐标定位，签署页码不能空"),
    ESIGN_POS_PAGE_ERROR("600006", "定位类型错误"),
    ESIGN_NO_KEY("600007", "定位类型为关键字定位，关键字不能空"),
    ESIGN_SIGN_TYPE_ERROR("600008", "签章类型错误"),
    ESIGN_NOT_MATCHING_ERROR("600009", "选择关键字定位，签章类型必须指定为关键字签章"),
    ESIGN_H_Q_TEXT_ERROR("600010", "个人印章，无需横向文或下弦文内容"),
    // 上传影像资料错误
    UPLOAD_ERROR("400000", "文件上传失败"),
    PICTURE_TYPE_ERROR("400001", "文件类别错误"),
    PICTURE_REPE_ERROR("400002", "文件类别重复"),
    NO_FILE_ERROR("400003", "文件信息不存在"),
    NO_SEAL_ERROR("400004", "印章图片不能空"),

    // 二类账户快捷充值（遥米）接口特殊异常码
    SPECIAL_CODE("FT0114", "特殊异常，请通过查询接口查询代扣租金结果"),

    //  二类账户贷款归还(单笔实时)---正常接口特殊异常码
    REPAY_SPECIAL_CODE("FT0301", "返回账户余额不足——还款结果记为失败的标志"),

    //系统错误
    SYSTEM_ERROR("100000", "系统错误，请联系管理员"),
    SYSTEM_SIGNERROR("100001", "签名校验未通过"),
    SYSTEM_USERPWDERROR("100002", "用户名或密码错误"),
    SYSTEM_SMSFAIL("100003", "短信发送失败"),
    SYSTEM_PHONEERROR("100004", "手机号码出错"),
    SYSTEM_REPEATREQ("100005", "已交易成功，请勿重复请求"),
    SYSTEM_CHECKCODEERROR("100006", "验证码错误"),
    SYSTEM_PWDFORMATERROR("100007", "密码格式错误"),
    SYSTEM_LOGOUTERROR("100008", "登出失败"),
    SYSTEM_LOGINTIMEOUT("100009", "登录超时"),
    SYSTEM_REPEATRE("100010", "手机号码已被注册"),
    SYSTEM_NOTREGISTER("100011", "手机号码未注册"),
    SYSTEM_FOURCHECKFAIL("100012", "四要素验证失败"),
    SYSTEM_NOUSER("100013", "用户不存在"),
    SYSTEM_NOAPIAUTH("100014", "没有该接口权限"),
    ARGS_ERROR("100015", "参数错误"),
    SYSTEM_PWDERROR("100016", "旧密码错误"),
    PID_NOT_EXIST("100017", "身份证号不存在"),
    THIRD_INTERFACE_FAIL("100018", "第三方接口返回失败"),
    THIRD_INTERFACE_ERROR("100019", "第三方接口调用失败"),
    THIRD_RSPMSG_ERROR("100020", "第三方接口返回数据错误"),
    END_DAY_DOING("100021", "日终执行中，禁止交易"),
    END_DAY_PROCESSING("100022", "日终处理中"),
    NOT_ALLOW_REQUEST_TIME("100023", "不在允许请求api时间段"),
    NOT_ACCOUNT_FILE("100024", "没有直销对账文件"),
    NOT_DATA("100025", "直销银行对账文件没有数据"),
    REQUEST_NOT_DATA("100026", "查无数据"),
    CONTRACTTYPEONE_ERROR("100027", "签署征信授权协议失败"),
    CONTRACTTYPETWO_ERROR("100028", "签署借款借据合同失败"),
    APPLYAMOUNT_ONE_ERROR("100029", "单笔申请金额不符"),
    APPLY_PERIOD_ERROR("100030", "申请期数不符"),
    ZHYH_REQUEST_ERROR("100031", "查询直销银行失败"),
    REQUEST_YHQ_ERROR("100032", "此借据已还清"),
    REQUEST_REJECT("100033", "此借据不在业务范围"),
    SPOUSE_ERROR("100044", "配偶信息为空"),
    CONFIG_NOT_DATA("100045", "未配置相关数据"),
    USER_TENANT_NOT_DATA("100046", "未申请小贷服务"),
    SYSTEM_USER_END("100047", "账户有效期已过"),
    SYSTEM_USER_NOTSTART("100048", "账户未到使用时间"),
    SYSTEM_USER_TENANT_NOTEXIST("100049", "租户公司不存在"),
    SUBJECTRULE_NOT_CONGFIG("100050", "科目规则未配置"),
    SUBJECTRULE_NOT_MATCH_PARAMS("100051", "入参数据与科目规则配置不配置"),
    WORKFLOW_FAIL("100052", "申请失败"),

    CHANGETYPE_NOT_EXIST("70000", "变更类型不存在"),
    CHANGETYPE_VALUE_ISNULL("70001", "变更值为空"),
    SERIALNO_TYPE_NOT_EXIST("70002", "序列号类型不存在"),

    //短信业务提示
    SMS_SCENE_NOT_FOUND("80001", "场景不能为空！"),
    SMS_SCENE_NOT_MATCHING("80002", "没有匹配的场景！请确认！"),
    SMS_SCENE_NOT_EXIST("80003", "场景不存在或未开启！请确认！"),
    MOBILE_NOT_EXIST("80004", "手机号不能为空"),
    CODE_NOT_EXIST("80005", "验证码不能为空"),

    SMS_TEMPLATE_NOT_EXIST("80101", "短信模板不存在！请确认！"),
    SMS_TEMPLATE_NO_TRIGGER_CONDITION("80102", "短信模板未设置触发条件！"),
    TEMPLATE_ID_NOT_EXIST("80103", "短信模板未设置模板id！"),
    TEMPLATE_VARIABLE_NOT_EXIST("80104", "短信模板变量未配置！"),
    WX_INFO_NOT_EXIST("80105", "短信模板变量未配置！"),


    ;

    String recode;
    String remsg;

    ErrorCodeEnum(String recode, String remsg) {
        this.recode = recode;
        this.remsg = remsg;
    }

    public String getRecode() {
        return recode;
    }

    public String getRemsg() {
        return remsg;
    }

    @Override
    public String toString() {
        return "{"
                + "\"code\":\""
                + recode + '\"'
                + ",\"msg\":\""
                + remsg + '\"'
                + "}";

    }
}
