//package com.altarix.users.service;
//
//@Service("userDetailsServiceImpl")
//public class UserDetailsServiceImpl implements UserDetailsService {
//
//    @Autowired
//    private UserAccountDao userDao;
//
//    @Autowired
//    private Assembler assembler;
//
//    @Override
//    public UserDetails loadUserByUsername(String username)
//            throws UsernameNotFoundException, DataAccessException {
//
//        UserAccount userAccount = userDao.findByUsername(username);
//
//        if(userAccount == null) {
//            throw new UsernameNotFoundException("user not found");
//        }
//
//        return assembler.buildUserFromUserEntity(userAccount);
//    }
//
//}
//
//@Service("userDetailsServiceImpl")
//public class LoginChekinService {
//
//    @Autowired
//    private UserAccountDao userDao;
//
//    @Autowired
//    private Assembler assembler;
//
//    @Override
//    public UserDetails loadUserByUsername(String username)
//            throws UsernameNotFoundException, DataAccessException {
//
//        UserAccount userAccount = userDao.findByUsername(username);
//
//        if(userAccount == null) {
//            throw new UsernameNotFoundException("user not found");
//        }
//
//        return assembler.buildUserFromUserEntity(userAccount);
//    }
//
//}
//}
