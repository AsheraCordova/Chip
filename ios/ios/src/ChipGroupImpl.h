//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSChipPlugin\src\main\java\com\ashera\chip\ChipGroupImpl.java
//

#include "J2ObjC_header.h"

#pragma push_macro("INCLUDE_ALL_ChipGroupImpl")
#ifdef RESTRICT_ChipGroupImpl
#define INCLUDE_ALL_ChipGroupImpl 0
#else
#define INCLUDE_ALL_ChipGroupImpl 1
#endif
#undef RESTRICT_ChipGroupImpl

#if !defined (ASChipGroupImpl_) && (INCLUDE_ALL_ChipGroupImpl || defined(INCLUDE_ASChipGroupImpl))
#define ASChipGroupImpl_

#define RESTRICT_BaseHasWidgets 1
#define INCLUDE_ASBaseHasWidgets 1
#include "BaseHasWidgets.h"

@class ASWidgetAttribute;
@class IOSClass;
@protocol ASIFragment;
@protocol ASILifeCycleDecorator;
@protocol ASIWidget;
@protocol JavaUtilMap;

@interface ASChipGroupImpl : ASBaseHasWidgets
@property id uiView;

#pragma mark Public

- (instancetype)init;

- (instancetype)initWithNSString:(NSString *)localname;

- (instancetype)initWithNSString:(NSString *)groupName
                    withNSString:(NSString *)localname;

- (void)addWithASIWidget:(id<ASIWidget>)w
                 withInt:(jint)index;

- (id)asNativeWidget;

- (id)asWidget;

- (jboolean)checkIosVersionWithNSString:(NSString *)v;

- (void)createWithASIFragment:(id<ASIFragment>)fragment
              withJavaUtilMap:(id<JavaUtilMap>)params;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
              withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (id)getChildAttributeWithASIWidget:(id<ASIWidget>)w
               withASWidgetAttribute:(ASWidgetAttribute *)key;

- (IOSClass *)getViewClass;

- (void)invalidate;

- (void)loadAttributesWithNSString:(NSString *)localName;

- (void)nativeCreateWithJavaUtilMap:(id<JavaUtilMap>)params;

- (id<ASIWidget>)newInstance OBJC_METHOD_FAMILY_NONE;

- (jboolean)removeWithInt:(jint)index;

- (jboolean)removeWithASIWidget:(id<ASIWidget>)w;

- (void)requestLayout;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)key
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue
                withASILifeCycleDecorator:(id<ASILifeCycleDecorator>)decorator;

- (void)setChildAttributeWithASIWidget:(id<ASIWidget>)w
                 withASWidgetAttribute:(ASWidgetAttribute *)key
                          withNSString:(NSString *)strValue
                                withId:(id)objValue;

- (void)setIdWithNSString:(NSString *)id_;

- (void)setVisibleWithBoolean:(jboolean)b;

@end

J2OBJC_EMPTY_STATIC_INIT(ASChipGroupImpl)

inline NSString *ASChipGroupImpl_get_LOCAL_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASChipGroupImpl_LOCAL_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASChipGroupImpl, LOCAL_NAME, NSString *)

inline NSString *ASChipGroupImpl_get_GROUP_NAME(void);
/*! INTERNAL ONLY - Use accessor function from above. */
FOUNDATION_EXPORT NSString *ASChipGroupImpl_GROUP_NAME;
J2OBJC_STATIC_FIELD_OBJ_FINAL(ASChipGroupImpl, GROUP_NAME, NSString *)

FOUNDATION_EXPORT void ASChipGroupImpl_init(ASChipGroupImpl *self);

FOUNDATION_EXPORT ASChipGroupImpl *new_ASChipGroupImpl_init(void) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASChipGroupImpl *create_ASChipGroupImpl_init(void);

FOUNDATION_EXPORT void ASChipGroupImpl_initWithNSString_(ASChipGroupImpl *self, NSString *localname);

FOUNDATION_EXPORT ASChipGroupImpl *new_ASChipGroupImpl_initWithNSString_(NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASChipGroupImpl *create_ASChipGroupImpl_initWithNSString_(NSString *localname);

FOUNDATION_EXPORT void ASChipGroupImpl_initWithNSString_withNSString_(ASChipGroupImpl *self, NSString *groupName, NSString *localname);

FOUNDATION_EXPORT ASChipGroupImpl *new_ASChipGroupImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASChipGroupImpl *create_ASChipGroupImpl_initWithNSString_withNSString_(NSString *groupName, NSString *localname);

J2OBJC_TYPE_LITERAL_HEADER(ASChipGroupImpl)

@compatibility_alias ComAsheraChipChipGroupImpl ASChipGroupImpl;

#endif

#if !defined (ASChipGroupImpl_ChipGroupExt_) && (INCLUDE_ALL_ChipGroupImpl || defined(INCLUDE_ASChipGroupImpl_ChipGroupExt))
#define ASChipGroupImpl_ChipGroupExt_

#define RESTRICT_ChipGroup 1
#define INCLUDE_ADXChipGroup 1
#include "ChipGroup.h"

#define RESTRICT_ILifeCycleDecorator 1
#define INCLUDE_ASILifeCycleDecorator 1
#include "ILifeCycleDecorator.h"

#define RESTRICT_IMaxDimension 1
#define INCLUDE_ASIMaxDimension 1
#include "IMaxDimension.h"

@class ADRect;
@class ADView;
@class ASChipGroupImpl;
@class ASWidgetAttribute;
@class IOSIntArray;
@class IOSObjectArray;
@protocol ASIWidget;
@protocol JavaUtilList;

@interface ASChipGroupImpl_ChipGroupExt : ADXChipGroup < ASILifeCycleDecorator, ASIMaxDimension >

#pragma mark Public

- (instancetype)initWithASChipGroupImpl:(ASChipGroupImpl *)outer$;

- (void)drawableStateChanged;

- (void)endViewTransitionWithADView:(ADView *)view;

- (void)executeWithNSString:(NSString *)method
          withNSObjectArray:(IOSObjectArray *)canvas;

- (id)getAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute;

- (void)getLocationOnScreenWithIntArray:(IOSIntArray *)appScreenLocation;

- (jint)getMaxHeight;

- (jint)getMaxWidth;

- (id<JavaUtilList>)getMethods;

- (id<ASIWidget>)getWidget;

- (void)getWindowVisibleDisplayFrameWithADRect:(ADRect *)displayFrame;

- (ADView *)inflateViewWithNSString:(NSString *)layout;

- (void)initialized OBJC_METHOD_FAMILY_NONE;

- (id<ASILifeCycleDecorator>)newInstanceWithASIWidget:(id<ASIWidget>)widget OBJC_METHOD_FAMILY_NONE;

- (void)offsetLeftAndRightWithInt:(jint)offset;

- (void)offsetTopAndBottomWithInt:(jint)offset;

- (void)onMeasureWithInt:(jint)widthMeasureSpec
                 withInt:(jint)heightMeasureSpec;

- (void)remeasure;

- (void)removeFromParent;

- (void)setAttributeWithASWidgetAttribute:(ASWidgetAttribute *)widgetAttribute
                             withNSString:(NSString *)strValue
                                   withId:(id)objValue;

- (void)setMaxHeightWithInt:(jint)height;

- (void)setMaxWidthWithInt:(jint)width;

- (void)setMyAttributeWithNSString:(NSString *)name
                            withId:(id)value;

- (void)setState0WithId:(id)value;

- (void)setState1WithId:(id)value;

- (void)setState2WithId:(id)value;

- (void)setState3WithId:(id)value;

- (void)setState4WithId:(id)value;

- (void)setVisibilityWithInt:(jint)visibility;

- (void)state0;

- (void)state1;

- (void)state2;

- (void)state3;

- (void)state4;

- (void)stateNo;

- (void)stateYes;

- (void)updateMeasuredDimensionWithInt:(jint)width
                               withInt:(jint)height;

#pragma mark Protected

- (void)onLayoutWithBoolean:(jboolean)changed
                    withInt:(jint)l
                    withInt:(jint)t
                    withInt:(jint)r
                    withInt:(jint)b;

// Disallowed inherited constructors, do not use.

- (instancetype)init NS_UNAVAILABLE;

@end

J2OBJC_EMPTY_STATIC_INIT(ASChipGroupImpl_ChipGroupExt)

FOUNDATION_EXPORT void ASChipGroupImpl_ChipGroupExt_initWithASChipGroupImpl_(ASChipGroupImpl_ChipGroupExt *self, ASChipGroupImpl *outer$);

FOUNDATION_EXPORT ASChipGroupImpl_ChipGroupExt *new_ASChipGroupImpl_ChipGroupExt_initWithASChipGroupImpl_(ASChipGroupImpl *outer$) NS_RETURNS_RETAINED;

FOUNDATION_EXPORT ASChipGroupImpl_ChipGroupExt *create_ASChipGroupImpl_ChipGroupExt_initWithASChipGroupImpl_(ASChipGroupImpl *outer$);

J2OBJC_TYPE_LITERAL_HEADER(ASChipGroupImpl_ChipGroupExt)

#endif

#pragma pop_macro("INCLUDE_ALL_ChipGroupImpl")
