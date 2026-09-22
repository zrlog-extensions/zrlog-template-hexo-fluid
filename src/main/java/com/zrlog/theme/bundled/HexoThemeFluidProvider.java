package com.zrlog.theme.bundled;
import com.zrlog.theme.spi.BundledThemeProvider;
/** Registers the hexo-theme-fluid resources bundled in this JAR. */
public final class HexoThemeFluidProvider implements BundledThemeProvider {
 public String id() { return "hexo-theme-fluid"; }
 public String engine() { return "hexo"; }
 public String adapter() { return "fluid"; }
 public boolean isDefault() { return false; }
}
