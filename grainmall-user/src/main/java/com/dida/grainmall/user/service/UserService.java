package com.dida.grainmall.user.service;

import com.dida.grainmall.bean.UmsMember;
import com.dida.grainmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
