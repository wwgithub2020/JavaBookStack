package cn.itcoder.model.mapper;

import cn.itcoder.commons.PageResult;
import cn.itcoder.model.core.LambdaQueryWrapperX;
import cn.itcoder.model.datasource.UserDO;
import cn.itcoder.model.vo.UserReqVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<UserDO> {
    default PageResult<UserDO> selectUserPage(UserReqVO userReqVO) {
//        return selectPage(userReqVO, new LambdaQueryWrapperX<UserDO>()
//                .inIfPresent(UserDO::getEmail, userReqVO.getEmail())
//
//        );
        return null;
    }
}
