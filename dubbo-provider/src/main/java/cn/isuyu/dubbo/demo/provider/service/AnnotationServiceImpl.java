package cn.isuyu.dubbo.demo.provider.service;

import cn.isuyu.dubbo.demo.common.service.AnnotationService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2020/3/9 下午3:38
 */
@Service
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String say(String msg) {
        return "hello " + msg;
    }
}
