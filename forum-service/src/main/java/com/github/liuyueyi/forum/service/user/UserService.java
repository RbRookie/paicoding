package com.github.liuyueyi.forum.service.user;

import com.github.liueyueyi.forum.api.model.vo.user.UserInfoSaveReq;
import com.github.liueyueyi.forum.api.model.vo.user.UserSaveReq;
import com.github.liuyueyi.forum.service.user.dto.UserPageDTO;
import com.github.liuyueyi.forum.service.user.repository.entity.UserInfoDO;

/**
 * 用户Service接口
 *
 * @author louzai
 * @date 2022-07-20
 */
public interface UserService {

    /**
     * 保存用户
     * @param req
     * @throws Exception
     */
    void saveUser(UserSaveReq req) throws Exception;

    /**
     * 删除用户
     * @param userId
     */
    void deleteUser(Long userId) throws Exception;

    /**
     * 保存用户详情
     * @param req
     */
    void saveUserInfo(UserInfoSaveReq req);

    /**
     * 删除用户信息
     * @param userId
     */
    void deleteUserInfo(Long userId);

    /**
     * 查询用户详情信息
     * @param userId
     * @return
     */
    UserInfoDO getUserInfoByUserId(Long userId);


    /**
     * 查询用户主页信息
     * @param userId
     * @return
     * @throws Exception
     */
    UserPageDTO getUserPageDTO(Long userId) throws Exception;
}
