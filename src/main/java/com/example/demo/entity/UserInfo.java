package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import com.example.demo.validator.Mobile;
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 用户实体类
 * @author 程就人生
 * @Date
 */
@ApiModel(value = "用户信息")
public class UserInfo {
	
	@NotNull(message = "用户uid不能为空！")
    private String userUid;

	@NotEmpty(message = "用户密码不能为空！")
    @Size(min=6, max=15,message="密码长度必须在 6 ~ 15 字符之间！")
    @Pattern(regexp="^[a-zA-Z0-9|_]+$",message="密码必须由字母、数字、下划线组成！")
    private String userPwd;

    @NotBlank(message = "用户名不能为空")
    @Size(min=2, max=20,message="用户名必须在 2 ~ 20 字符之间！")
    private String userName;

    @Range(min=1, max=100,message="编码必须在 1 ~ 100 之间！")
    private int code;
    
    @Min(value=0,message="最小必须是0")
    @Max(value=1,message="最大不能超过1")
    private Byte sex;

    private String familyAddr;

    @Mobile
    @ApiModelProperty(value = "用户手机号码")
    private String mobile;
    
    @Email(message = "邮箱格式错误！")
    @Length(min=5, max=100,message="邮箱必须在 5 ~ 100 字符之间！")
    private String email;    
    
    
    private String idCard;
    
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @JsonFormat(pattern="yyyy-MM-dd", timezone = "GMT+8")
    @Past(message="不能大于当前年月日")
    private Date birthday;
    
    @NotNull(message="家庭金额不能为空！")
    @Digits(integer=5, fraction=2, message="家庭资金必须是5位整，2位小数！")
    @ApiModelProperty(value = "家庭金额")
    private Double familyMonney;
    
    @AssertTrue(message="状态必须正常！")
    @ApiModelProperty(value = "身体健康状态")
    private boolean status;

    @Null(message="初始金额必须为空！")
    private Double originMonney;
    
    @DecimalMax(value="999999999.00",message="我的金额不能超过999999999.00")
    private BigDecimal myMoney;

    public String getUserUid() {
        return userUid;
    }

    public void setUserUid(String userUid) {
        this.userUid = userUid == null ? null : userUid.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getFamilyAddr() {
        return familyAddr;
    }

    public void setFamilyAddr(String familyAddr) {
        this.familyAddr = familyAddr == null ? null : familyAddr.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public Double getFamilyMonney() {
		return familyMonney;
	}

	public void setFamilyMonney(Double familyMonney) {
		this.familyMonney = familyMonney;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Double getOriginMonney() {
		return originMonney;
	}

	public void setOriginMonney(Double originMonney) {
		this.originMonney = originMonney;
	}

	public BigDecimal getMyMoney() {
		return myMoney;
	}

	public void setMyMoney(BigDecimal myMoney) {
		this.myMoney = myMoney;
	}

}