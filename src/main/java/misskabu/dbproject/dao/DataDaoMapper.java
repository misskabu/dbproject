package misskabu.dbproject.dao;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

public interface DataDaoMapper {

    @Select("select code, title, contents from data_table")
    @Results(value={
            @Result(column="code", property="code"),
            @Result(column="title", property="title"),
            @Result(column="contents", property="contents")
    })
    List<DataDao> getAllData();

}