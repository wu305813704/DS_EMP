package com.sunyard.emp;

import cn.hutool.core.util.ZipUtil;
import com.sunyard.emp.codegen.entity.GenConfig;
import com.sunyard.emp.codegen.service.UserGeneratorService;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CodegenApplicationTests {
    @Resource
    private UserGeneratorService sysGeneratorService;
    private final String GEN_PATH = System.getProperty("user.dir") + "/temp";

    @Test
    public void contextLoads() throws IOException {
        GenConfig genConfig = new GenConfig();
        genConfig.setAuthor("KouKi");
        genConfig.setPackageName("com.sunyard.emp");
        //genConfig.setModuleName("accounts");
        genConfig.setComments("关系网络");
        genConfig.setTableName("company_relation");
        genConfig.setTablePrefix("");
        byte[] data = sysGeneratorService.generatorCode(genConfig);
        FileUtils.forceMkdir(new File(GEN_PATH));
        File zip = new File(GEN_PATH + File.separator + genConfig.getTableName() + ".zip");
        FileUtils.writeByteArrayToFile(zip, data);
        ZipUtil.unzip(zip, Charset.defaultCharset());
    }

}
