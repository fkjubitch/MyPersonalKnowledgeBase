package knowchain.server.service;

import knowchain.pojo.VO.FileAndDirItem;
import knowchain.pojo.entity.FileAndDirTable;

import java.util.List;

public interface FileService {

    /**
     * 生成文件和文件夹树型列表
     * @param fileAndDirTableList
     * @return
     */
    List<FileAndDirItem> generateFileAndDirList(List<FileAndDirTable> fileAndDirTableList);

}
