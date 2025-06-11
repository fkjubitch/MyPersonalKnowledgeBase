package knowchain.server.mapper;

import knowchain.pojo.entity.FileAndDirTable;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.math.BigInteger;
import java.util.List;

@Mapper
public interface FileMapper {

    // 根据fID选择表
    @Select("SELECT * FROM filetable WHERE fID = #{fid}")
    FileAndDirTable getByFID(@Param("fid") BigInteger fid);

    // 根据userID选择表
    @Select("SELECT * FROM filetable WHERE userID = #{userid}")
    List<FileAndDirTable> getByUserID(@Param("userid") BigInteger userid);

}