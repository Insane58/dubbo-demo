package cn.isuyu.dubbo.demo.customer;

import cn.isuyu.dubbo.demo.customer.service.AnnotationDemoServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author NieZhiLiang
 * @Email nzlsgg@163.com
 * @GitHub https://github.com/niezhiliang
 * @Date 2020/3/10 上午9:47
 */
@SpringBootApplication
@RestController
public class CustomerApplication {
    @Autowired
    private AnnotationDemoServiceConsumer annotationDemoServiceConsumer;

    public static void main(String[] args) {
        SpringApplication.run(CustomerApplication.class);
    }

    @RequestMapping(value = "/")
    public String say() {
        return annotationDemoServiceConsumer.doSayHell("world");
    }

}