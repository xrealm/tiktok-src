package com.bytedance.android.live.base.model.proto;

import com.bytedance.android.live.base.model.C2335b;
import com.bytedance.android.live.base.model.C2340c;
import com.bytedance.android.live.base.model.FansClubMember;
import com.bytedance.android.live.base.model.FlexImageModel;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.ImageModel.Content;
import com.bytedance.android.live.base.model._CateCell_ProtoDecoder;
import com.bytedance.android.live.base.model._Category_ProtoDecoder;
import com.bytedance.android.live.base.model._FansClubMember_ProtoDecoder;
import com.bytedance.android.live.base.model._FlexImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_Content_ProtoDecoder;
import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.live.base.model.banner.C2337a;
import com.bytedance.android.live.base.model.banner.C2338b;
import com.bytedance.android.live.base.model.banner.C2339c;
import com.bytedance.android.live.base.model.banner._FeedBannerContainer_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._FeedBanner_ProtoDecoder;
import com.bytedance.android.live.base.model.banner._RankRoundBanner_ProtoDecoder;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.C2344a.C2345a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.feed._FeedExtra_LogPb_ProtoDecoder;
import com.bytedance.android.live.base.model.feed._FeedExtra_ProtoDecoder;
import com.bytedance.android.live.base.model.feed._FeedItem_ProtoDecoder;
import com.bytedance.android.live.base.model.live.C2352c;
import com.bytedance.android.live.base.model.live.C2353d;
import com.bytedance.android.live.base.model.live.RoomStats;
import com.bytedance.android.live.base.model.live.RoomStats.C2349a;
import com.bytedance.android.live.base.model.live._RankUser_ProtoDecoder;
import com.bytedance.android.live.base.model.live._Ranking_ProtoDecoder;
import com.bytedance.android.live.base.model.live._RoomStats_ProtoDecoder;
import com.bytedance.android.live.base.model.live._RoomStats_UserComposition_ProtoDecoder;
import com.bytedance.android.live.base.model.user.C2367a;
import com.bytedance.android.live.base.model.user.C2370b;
import com.bytedance.android.live.base.model.user.C2371c;
import com.bytedance.android.live.base.model.user.C2372d;
import com.bytedance.android.live.base.model.user.C2373e;
import com.bytedance.android.live.base.model.user.C2374f;
import com.bytedance.android.live.base.model.user.C2376h;
import com.bytedance.android.live.base.model.user.C2378j;
import com.bytedance.android.live.base.model.user.C2380l;
import com.bytedance.android.live.base.model.user.C2381m;
import com.bytedance.android.live.base.model.user.C2381m.C2382a;
import com.bytedance.android.live.base.model.user.C2381m.C2383b;
import com.bytedance.android.live.base.model.user.FansClubData;
import com.bytedance.android.live.base.model.user.FansClubData.UserBadge;
import com.bytedance.android.live.base.model.user.FollowInfo;
import com.bytedance.android.live.base.model.user.FraternityInfo;
import com.bytedance.android.live.base.model.user.NobleLevelInfo;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.base.model.user.User.C2366a;
import com.bytedance.android.live.base.model.user._ActivityRewardInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._AnchorInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._AnchorLevel_ProtoDecoder;
import com.bytedance.android.live.base.model.user._AuthenticationInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._Author_ProtoDecoder;
import com.bytedance.android.live.base.model.user._BorderInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FansClubData_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FansClubData_UserBadge_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FollowInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._FraternityInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._GradeIcon_ProtoDecoder;
import com.bytedance.android.live.base.model.user._NobleLevelInfo_ProtoDecoder;
import com.bytedance.android.live.base.model.user._UserAttr_ProtoDecoder;
import com.bytedance.android.live.base.model.user._UserHonor_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_OwnRoom_ProtoDecoder;
import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.live.base.model.user._XiguaUserParams_ProtoDecoder;
import com.bytedance.android.live.base.model.user._XiguaUserParams_RocketSchema_ProtoDecoder;
import com.bytedance.android.live.base.model.user._XiguaUserParams_UserExtendInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live.C9357a;
import com.bytedance.android.livesdkapi.depend.model.live.C9358b;
import com.bytedance.android.livesdkapi.depend.model.live.C9358b.C9359a;
import com.bytedance.android.livesdkapi.depend.model.live.C9360c;
import com.bytedance.android.livesdkapi.depend.model.live.C9361d;
import com.bytedance.android.livesdkapi.depend.model.live.C9362e;
import com.bytedance.android.livesdkapi.depend.model.live.C9363f;
import com.bytedance.android.livesdkapi.depend.model.live.C9364g;
import com.bytedance.android.livesdkapi.depend.model.live.C9365h;
import com.bytedance.android.livesdkapi.depend.model.live.C9366i;
import com.bytedance.android.livesdkapi.depend.model.live.C9367j;
import com.bytedance.android.livesdkapi.depend.model.live.C9372l;
import com.bytedance.android.livesdkapi.depend.model.live.C9373m;
import com.bytedance.android.livesdkapi.depend.model.live.C9373m.C9374a;
import com.bytedance.android.livesdkapi.depend.model.live.C9373m.C9375b;
import com.bytedance.android.livesdkapi.depend.model.live.C9378o;
import com.bytedance.android.livesdkapi.depend.model.live.C9379p;
import com.bytedance.android.livesdkapi.depend.model.live.C9380q;
import com.bytedance.android.livesdkapi.depend.model.live.C9381r;
import com.bytedance.android.livesdkapi.depend.model.live.C9382s;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t;
import com.bytedance.android.livesdkapi.depend.model.live.C9383t.C9384a;
import com.bytedance.android.livesdkapi.depend.model.live.C9385u;
import com.bytedance.android.livesdkapi.depend.model.live.C9387w;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Options;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.PullData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.model.live._BannerInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleMode_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleMode_StealTowerData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleScorePairInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleScorePair_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleSettingInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleSetting_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BattleTask_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._BurstInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ChannelInfoInRoom_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._ChannelInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_Options_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_PullData_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LiveCoreSDKData_Quality_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._LivePlayTagInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._MatchInfo_FollowBtnSkin_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._MatchInfo_MatchSkinInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._MatchInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._OfficialRoomInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomAuthStatus_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomDecoration_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomLinkInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomTab_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._RoomUserAttr_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._Room_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrlExtra_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrlExtra_SrConfig_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._StreamUrl_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._TopFanTicket_ProtoDecoder;
import com.bytedance.android.livesdkapi.depend.model.live._UserHealthScoreInfo_ProtoDecoder;
import com.bytedance.android.livesdkapi.message.C9500b;
import com.bytedance.android.livesdkapi.message.C9502d;
import com.bytedance.android.livesdkapi.message.C9503e;
import com.bytedance.android.livesdkapi.message.C9503e.C9504a;
import com.bytedance.android.livesdkapi.message.C9505f;
import com.bytedance.android.livesdkapi.message.C9506g;
import com.bytedance.android.livesdkapi.message.C9507h;
import com.bytedance.android.livesdkapi.message.C9508i;
import com.bytedance.android.livesdkapi.message.C9509j;
import com.bytedance.android.livesdkapi.message.C9510k;
import com.bytedance.android.livesdkapi.message.C9511l;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._PatternRef_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._ProtoMessageFetchResult_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextFormat_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPieceGift_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPieceHeart_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPiecePatternRef_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPieceUser_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._TextPiece_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p109c.p110a.p111a.C2265b;
import java.util.HashMap;
import java.util.Map;

public final class _ProtoDecoders_LIVEBASE {
    private static final Map<Class, C2265b> DECODER_MAP = new HashMap();

    public final void inject(Map<Class, C2265b> map) {
        map.put(C9503e.class, new _ProtoMessageFetchResult_ProtoDecoder());
        map.put(C9504a.class, new _ProtoMessageFetchResult_BaseProtoMessage_ProtoDecoder());
        map.put(C9508i.class, new _TextPieceGift_ProtoDecoder());
        map.put(C9507h.class, new _TextPiece_ProtoDecoder());
        map.put(C9510k.class, new _TextPiecePatternRef_ProtoDecoder());
        map.put(C9502d.class, new _PatternRef_ProtoDecoder());
        map.put(C9506g.class, new _TextFormat_ProtoDecoder());
        map.put(C9511l.class, new _TextPieceUser_ProtoDecoder());
        map.put(C9500b.class, new _CommonMessageData_ProtoDecoder());
        map.put(C9505f.class, new _Text_ProtoDecoder());
        map.put(C9509j.class, new _TextPieceHeart_ProtoDecoder());
        map.put(RoomAuthStatus.class, new _RoomAuthStatus_ProtoDecoder());
        map.put(C9385u.class, new _TopFanTicket_ProtoDecoder());
        map.put(C9372l.class, new _LivePlayTagInfo_ProtoDecoder());
        map.put(C9373m.class, new _MatchInfo_ProtoDecoder());
        map.put(C9375b.class, new _MatchInfo_MatchSkinInfo_ProtoDecoder());
        map.put(C9374a.class, new _MatchInfo_FollowBtnSkin_ProtoDecoder());
        map.put(C9380q.class, new _RoomLinkInfo_ProtoDecoder());
        map.put(C9379p.class, new _RoomDecoration_ProtoDecoder());
        map.put(C9367j.class, new _ChannelInfoInRoom_ProtoDecoder());
        map.put(C9366i.class, new _ChannelInfo_ProtoDecoder());
        map.put(C9383t.class, new _StreamUrlExtra_ProtoDecoder());
        map.put(C9384a.class, new _StreamUrlExtra_SrConfig_ProtoDecoder());
        map.put(C9387w.class, new _UserHealthScoreInfo_ProtoDecoder());
        map.put(C9363f.class, new _BattleSettingInRoom_ProtoDecoder());
        map.put(C9361d.class, new _BattleScorePairInRoom_ProtoDecoder());
        map.put(C9357a.class, new _BannerInRoom_ProtoDecoder());
        map.put(C9364g.class, new _BattleTask_ProtoDecoder());
        map.put(StreamUrl.class, new _StreamUrl_ProtoDecoder());
        map.put(C9358b.class, new _BattleMode_ProtoDecoder());
        map.put(C9359a.class, new _BattleMode_StealTowerData_ProtoDecoder());
        map.put(C9378o.class, new _OfficialRoomInfo_ProtoDecoder());
        map.put(C9360c.class, new _BattleScorePair_ProtoDecoder());
        map.put(LiveCoreSDKData.class, new _LiveCoreSDKData_ProtoDecoder());
        map.put(PullData.class, new _LiveCoreSDKData_PullData_ProtoDecoder());
        map.put(Options.class, new _LiveCoreSDKData_Options_ProtoDecoder());
        map.put(Quality.class, new _LiveCoreSDKData_Quality_ProtoDecoder());
        map.put(Room.class, new _Room_ProtoDecoder());
        map.put(C9382s.class, new _RoomUserAttr_ProtoDecoder());
        map.put(C9381r.class, new _RoomTab_ProtoDecoder());
        map.put(C9362e.class, new _BattleSetting_ProtoDecoder());
        map.put(C9365h.class, new _BurstInfo_ProtoDecoder());
        map.put(C2335b.class, new _CateCell_ProtoDecoder());
        map.put(C2340c.class, new _Category_ProtoDecoder());
        map.put(FlexImageModel.class, new _FlexImageModel_ProtoDecoder());
        map.put(C2380l.class, new _UserHonor_ProtoDecoder());
        map.put(C2367a.class, new _ActivityRewardInfo_ProtoDecoder());
        map.put(NobleLevelInfo.class, new _NobleLevelInfo_ProtoDecoder());
        map.put(C2373e.class, new _Author_ProtoDecoder());
        map.put(C2372d.class, new _AuthenticationInfo_ProtoDecoder());
        map.put(C2378j.class, new _UserAttr_ProtoDecoder());
        map.put(User.class, new _User_ProtoDecoder());
        map.put(C2366a.class, new _User_OwnRoom_ProtoDecoder());
        map.put(FraternityInfo.class, new _FraternityInfo_ProtoDecoder());
        map.put(FansClubData.class, new _FansClubData_ProtoDecoder());
        map.put(UserBadge.class, new _FansClubData_UserBadge_ProtoDecoder());
        map.put(C2374f.class, new _BorderInfo_ProtoDecoder());
        map.put(C2371c.class, new _AnchorLevel_ProtoDecoder());
        map.put(FollowInfo.class, new _FollowInfo_ProtoDecoder());
        map.put(C2370b.class, new _AnchorInfo_ProtoDecoder());
        map.put(C2381m.class, new _XiguaUserParams_ProtoDecoder());
        map.put(C2383b.class, new _XiguaUserParams_UserExtendInfo_ProtoDecoder());
        map.put(C2382a.class, new _XiguaUserParams_RocketSchema_ProtoDecoder());
        map.put(C2376h.class, new _GradeIcon_ProtoDecoder());
        map.put(RoomStats.class, new _RoomStats_ProtoDecoder());
        map.put(C2349a.class, new _RoomStats_UserComposition_ProtoDecoder());
        map.put(C2353d.class, new _Ranking_ProtoDecoder());
        map.put(C2352c.class, new _RankUser_ProtoDecoder());
        map.put(C2344a.class, new _FeedExtra_ProtoDecoder());
        map.put(C2345a.class, new _FeedExtra_LogPb_ProtoDecoder());
        map.put(FeedItem.class, new _FeedItem_ProtoDecoder());
        map.put(C2339c.class, new _RankRoundBanner_ProtoDecoder());
        map.put(C2338b.class, new _FeedBannerContainer_ProtoDecoder());
        map.put(C2337a.class, new _FeedBanner_ProtoDecoder());
        map.put(ImageModel.class, new _ImageModel_ProtoDecoder());
        map.put(Content.class, new _ImageModel_Content_ProtoDecoder());
        map.put(FansClubMember.class, new _FansClubMember_ProtoDecoder());
    }
}
