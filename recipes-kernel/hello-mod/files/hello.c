/******************************************************************************
 *
 *   Copyright (C) 2011  Intel Corporation. All rights reserved.
 *
 *   SPDX-License-Identifier: GPL-2.0-only
 *
 *****************************************************************************/

#include <linux/module.h>

static int __init hello_init(void)
{
	pr_info("loading kernel module !\n");
	return 0;
}

static void __exit hello_exit(void)
{
	pr_info("unloading kernel module!\n");
}

module_init(hello_init);
module_exit(hello_exit);
MODULE_LICENSE("GPL");
