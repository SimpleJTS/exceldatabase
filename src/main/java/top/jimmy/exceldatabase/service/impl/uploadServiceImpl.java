package top.jimmy.exceldatabase.service.impl;

import com.alibaba.excel.EasyExcel;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import top.jimmy.exceldatabase.domain.User;
import top.jimmy.exceldatabase.listener.UploadListener;
import top.jimmy.exceldatabase.service.uploadService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author : jimmy
 * @Description:
 * @date : 2019/8/13 0013
 */
@Service
public class uploadServiceImpl implements uploadService {
    @Override
    public String readExcleFile(MultipartFile file) {

        String result = "";
        try {
            EasyExcel.read(file.getInputStream(), User.class, new UploadListener()).sheet().doRead();
            result = "读取成功！";
        }catch (IOException e){
            result = "读取失败！";
            e.printStackTrace();
        }finally {
            return result;
        }
    }
}
