//
//  Generated by the J2ObjC translator.  DO NOT EDIT!
//  source: D:\Java\git\core-ios-widgets\IOSChipPlugin\src\main\java\com\ashera\chip\ChipPlugin.java
//

#include "ChipGroupImpl.h"
#include "ChipImpl.h"
#include "ChipPlugin.h"
#include "J2ObjC_source.h"
#include "WidgetFactory.h"


@implementation ASChipPlugin

J2OBJC_IGNORE_DESIGNATED_BEGIN
- (instancetype)init {
  ASChipPlugin_init(self);
  return self;
}
J2OBJC_IGNORE_DESIGNATED_END

+ (void)initPlugin {
  ASChipPlugin_initPlugin();
}

+ (const J2ObjcClassInfo *)__metadata {
  static J2ObjcMethodInfo methods[] = {
    { NULL, NULL, 0x1, -1, -1, -1, -1, -1, -1 },
    { NULL, "V", 0x9, -1, -1, -1, -1, -1, -1 },
  };
  #pragma clang diagnostic push
  #pragma clang diagnostic ignored "-Wobjc-multiple-method-names"
  #pragma clang diagnostic ignored "-Wundeclared-selector"
  methods[0].selector = @selector(init);
  methods[1].selector = @selector(initPlugin);
  #pragma clang diagnostic pop
  static const J2ObjcClassInfo _ASChipPlugin = { "ChipPlugin", "com.ashera.chip", NULL, methods, NULL, 7, 0x1, 2, 0, -1, -1, -1, -1, -1 };
  return &_ASChipPlugin;
}

@end

void ASChipPlugin_init(ASChipPlugin *self) {
  NSObject_init(self);
}

ASChipPlugin *new_ASChipPlugin_init() {
  J2OBJC_NEW_IMPL(ASChipPlugin, init)
}

ASChipPlugin *create_ASChipPlugin_init() {
  J2OBJC_CREATE_IMPL(ASChipPlugin, init)
}

void ASChipPlugin_initPlugin() {
  ASChipPlugin_initialize();
  ASWidgetFactory_register__WithASIWidget_(new_ASChipImpl_init());
  ASWidgetFactory_register__WithASIWidget_(new_ASChipGroupImpl_init());
}

J2OBJC_CLASS_TYPE_LITERAL_SOURCE(ASChipPlugin)
