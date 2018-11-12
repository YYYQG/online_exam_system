package com.xxx.realm;


import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

public class UserRealm extends AuthorizingRealm {

//    @Autowired
//    UserService userService;


    /**
     * 授权方法
     *
     * @param principalCollection
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

//        根据当前登陆的角色,查询用户的角色,根据角色对应获取的权限添加到信息对象中;
//        User users = (User) principalCollection.getPrimaryPrincipal();
//
//        List<String> list = null;
//        if (users. ().equals("admin")){
////            从数据库获取到所有的权限
//        } else{
//
//        }
//        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
//        info.addStringPermission("admin");
        return null;
    }

    /**
     * 认证方法
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken usernamePasswordToken = (UsernamePasswordToken) authenticationToken;
        String username = usernamePasswordToken.getUsername();
//        User user = userService.selectUserByUserName(username);
//        if (user == null) {
////            抛出账号找不到异常
//            throw new UnknownAccountException();
//        }
//        String passwordDB = user.getUserPassword();
////        设置盐值
//        ByteSource credentialSalt = ByteSource.Util.bytes(user.getUserSalt());
////        使用安全管理器进行认证
//        AuthenticationInfo info = new SimpleAuthenticationInfo(user, passwordDB, credentialSalt, getName());
//        return info;
        return null;
    }
}
