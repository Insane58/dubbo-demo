package cn.isuyu.dubbo.demo.customer.service;

import cn.isuyu.dubbo.demo.common.service.AnnotationService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2020/3/10 下午2:41
 */
@Service
public class AnnotationDemoServiceConsumer {

    @Reference
    private AnnotationService demoService;

    public String doSayHell(String name) {
        return demoService.say(name);
    }
}
