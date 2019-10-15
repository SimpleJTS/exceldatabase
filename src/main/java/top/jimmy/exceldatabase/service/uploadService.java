package top.jimmy.exceldatabase.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author : jimmy
 * @Description:
 * @date : 2019/8/13 0013
 */
public interface uploadService {

    String readExcleFile(MultipartFile file);
}
