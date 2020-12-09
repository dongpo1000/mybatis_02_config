package com.pywl.mapper;

import com.pywl.entity.Employee;
import org.apache.ibatis.annotations.Select;

/**
 * @Description mapper接口
 * @Author DongPo
 * @Date 2020-12 20:45
 */
public interface EmployeeMapper {

	/**
	 * 根据 id 查询
	 *
	 * @param id
	 * @return
	 */
	Employee selectByPrimaryId(Integer id);

	/**
	 * 注解方式根据 id 查询
	 *
	 * @param id
	 * @return
	 */
	@Select("select * from tb_employee where id = #{id}")
	Employee findById(Integer id);
}
