//package com.example.demo.aop;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//
///**
// * 控制器通知类(controller 增强器)
// * @author FengJuan
// * @date 2019年5月6日
// * @Description 
// * (
// *		//指定拦截包的控制器
// *		basePackages={"com.cloudfish.controller.*"},
// *		//限制被标注为@RestController的类才被拦截
// *      annotations = RestController.class)
// *
// */
//@RestControllerAdvice
//public class MyControllerAdvice {
//	
//	/**
//     * 全局异常捕捉处理
//     * @param ex
//     * @return
//     */
//    @ExceptionHandler(value = Exception.class)
//    public Map<String,Object> errorHandler(Exception ex) {
//    	//TODO
//    	//在后台打印错误信息
//    	ex.printStackTrace();
//    	//对各种异常提示信息的处理
//        Map<String,Object> map = new HashMap<>();
//        map.put("code", 500);
//        map.put("message", ex.getMessage());
//        return map;
//    }
//    
//
////    /**
////     * 自定义捕捉异常
////     * @param request
////     * @param ex
////     * @return
////     */
////	@ExceptionHandler(value=NotFoundException.class)
////	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
////	public Map<String,Object> exception(HttpServletRequest request, NotFoundException ex){
////		Map<String,Object> msgMap = new HashMap<>();
////		msgMap.put("code", ex.getCode());
////		msgMap.put("message", ex.getCustomMsg());
////		return msgMap;
////	}
//	
//}
