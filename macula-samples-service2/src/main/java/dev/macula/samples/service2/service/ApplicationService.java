package dev.macula.samples.service2.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import dev.macula.samples.service2.form.ApplicationForm;
import dev.macula.samples.service2.pojo.entity.Application;
import dev.macula.samples.service2.query.ApplicationPageQuery;
import dev.macula.samples.service2.vo.ApplicationVO;

/**
 * 应用业务接口
 */
public interface ApplicationService extends IService<Application> {

    /**
     * 应用分页列表
     *
     * @return 应用列表
     */
    Page<ApplicationVO> listApplicationPages(ApplicationPageQuery queryParams);

    /**
     * 新增应用
     *
     * @param appForm 应用表单对象
     * @return 是否成功, boolean
     */
    boolean saveApplication(ApplicationForm appForm);

    /**
     * 修改应用
     *
     * @param appId   应用ID
     * @param appForm 应用表单对象
     * @return 是否成功，boolean
     */
    boolean updateApplication(Long appId, ApplicationForm appForm);

    /**
     * 删除应用
     *
     * @param idsStr 应用ID，多个以英文逗号(,)分割
     * @return 是否成功，boolean
     */
    boolean deleteApplications(String idsStr);

    /**
     * 管理维护人
     *
     * @param appId
     * @param appForm
     * @return 是否成功，boolean
     */
    boolean addMaintainer(Long appId, ApplicationForm appForm);
}
