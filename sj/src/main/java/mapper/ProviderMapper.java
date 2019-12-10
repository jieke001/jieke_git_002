package mapper;

import entity.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//供应商mapper接口代理
public interface ProviderMapper {

    public int addProvider(Provider provider);   //增加供应商表信息

    public int updateProvider(@Param("proCode") String proCode,@Param("proName") String proName);  //修改供应商表信息

    public int delProvider(int sid);     //删除供应商表信息

    public List<Provider> providerIdList(int id);   //根据供应商id查询出相关信息，以及其下所有的订单列表

    public List<Provider> providerByCodeAndName(@Param("proCode") String proCode,@Param("proName")String proName);  //根据供应商编码、供应商名称模糊查询

    public List<Provider> providerByIdList(List<Integer> ids);  //根据供应商id列表获取供应商下的订单列表信息

    //按条件查询供应商表，供应商编码（模糊查询）、供应商名称（模糊查询）、供应商名称（模糊查询）、创建时间在本年内（时间范围）
    public List<Provider> proByCodeAndNameAndContactAndCreateDate(Provider provider);

    //查询供应商表总记录数
    public int count();

    //供应商表分页查询
    public List<Provider> providerLimit(@Param("currentPageNo") int currentPageNo,@Param("pageSize")int pageSize);

}
